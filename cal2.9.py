import tkinter as tk

# Function to update the display panel
def button_click(value):
    current_text = display_var.get()
    display_var.set(current_text + value)

# Function to clear the display panel
def clear_display():
    display_var.set("")

# Function to evaluate the expression
def evaluate_expression():
    try:
        result = eval(display_var.get())
        display_var.set(str(result))
    except Exception as e:
        display_var.set("Error")

# Create the main window
root = tk.Tk()
root.title("Calculator")

# Create a StringVar to hold the text for the display panel
display_var = tk.StringVar()

# Create the display panel (Entry widget)
display = tk.Entry(root, textvariable=display_var, font=('Helvetica', 16),bg='grey',fg='white', bd=10, insertwidth=2, width=27, borderwidth=4)
display.grid(row=0, column=0, columnspan=4)

# Define the buttons
buttons = [
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '-',
    '0', '.', '=', '+'
]

# Create and place the buttons using grid
row_val = 1
col_val = 0
for button in buttons:
    action = lambda x=button: button_click(x) if x != '=' else evaluate_expression()
    if button == '=':
        tk.Button(root, text=button, padx=20, pady=20, bd=8, fg="white",bg='grey', font=('Helvetica', 16), command=action).grid(row=row_val, column=col_val, columnspan=4, sticky="nsew")
    else:
        tk.Button(root, text=button, padx=20, pady=20, bd=8, fg="white",bg='grey', font=('Helvetica', 16), command=action).grid(row=row_val, column=col_val)
    col_val += 1
    if col_val > 3:
        col_val = 0
        row_val += 1

# Add a clear button
tk.Button(root, text='C', padx=20, pady=20, bd=8, fg="white",bg='grey', font=('Helvetica', 16), command=clear_display).grid(row=row_val, column=0, columnspan=4, sticky="nsew")

# Configure row and column weights to make the buttons expand and fill the space
for i in range(5):
    root.grid_rowconfigure(i, weight=1)
    root.grid_columnconfigure(i, weight=1)

# Start the main loop
root.mainloop()
