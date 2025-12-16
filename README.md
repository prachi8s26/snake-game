
# Snake Game – Low Level Design (Java)

## Overview

This project implements a **basic Snake Game** using **object-oriented design in Java**.  
The focus is on **Low-Level Design (LLD)**, clean class responsibilities, and correct game logic — not graphics or UI.

The game runs as a **console-based logical simulation**.

---

## Features

- Snake movement in four directions
- Snake growth on eating food
- Self-collision detection
- Board and cell management
- Clean separation of concerns

---

## Design Principles Used

- Single Responsibility Principle
- Encapsulation
- Clear object collaboration
- Minimal shared state

---

## Core Classes

---

### `Cell`

Represents a single unit on the board.

**Fields**
- `int row`
- `int col`
- `CellType cellType`

**Responsibilities**
- Stores position
- Stores current state (EMPTY, FOOD, SNAKE_NODE)

---

### `CellType` (Enum)

EMPTY
SNAKE_NODE
FOOD

Defines what a cell contains.

---

### Snake

Represents the snake.

Fields
	•	LinkedList<Cell> snakePartList
	•	Cell head

Responsibilities
	•	Move the snake
	•	Grow when food is eaten
	•	Detect self-collision

### Movement Logic

	•	Normal move:
	•	Remove tail
	•	Add new head
	•	Growth move:
	•	Add new head
	•	Do NOT remove tail

This ensures snake length increases correctly.

---

### Board

Represents the game grid.

Fields
	•	int rows
	•	int cols
	•	Cell[][] cells

Responsibilities
	•	Initialize the board
	•	Generate food at empty cells
	•	Provide access to grid cells

---

### Game

Controls the game flow.

Fields
	•	Snake snake
	•	Board board
	•	int direction
	•	boolean gameOver

Responsibilities
	•	Maintain direction
	•	Calculate next cell
	•	Detect collisions
	•	Update game state

### Directions

RIGHT, LEFT, UP, DOWN


---

## Game Flow
	1.	Initialize board and snake
	2.	Set initial direction
	3.	On each update:
	•	Compute next cell
	•	Check for collision
	•	Move snake
	•	Grow snake if food is eaten
	•	Generate new food
	4.	End game on collision

---

### Growth Logic Explained

If the snake eats food:
	•	The snake moves to the food cell
	•	Tail is not removed
	•	Snake length increases by 1

If no food is eaten:
	•	Tail is removed
	•	Snake length remains the same

This avoids duplicate head insertion and ensures correct growth behavior.

---

Sample Console Output

Going to start game
Snake is moving to 0 1
Snake is moving to 0 2
Food generated at 2 3
Snake grew
Game Over


---

How to Run

javac *.java
java Game


---

Constraints & Assumptions
	•	Board boundaries are respected
	•	Only one food item exists at a time
	•	No keyboard input (direction is predefined)
	•	No graphical rendering

---

Possible Enhancements
	•	Boundary collision detection
	•	Score tracking
	•	Keyboard input support
	•	Graphical UI (Swing / JavaFX)
	•	Pause / Resume functionality

---

Purpose

This project is intended for:
	•	LLD interview preparation
	•	Understanding object-oriented game design
	•	Practicing clean class interaction

---

Author
Prachi Suryawanshi

Created as a Low-Level Design practice project in Java.
