# Newsroom Elements

Newsroom Elements helps media teams prepare and publish video stories in several languages.

[Watch the product demo](docs/demo.webm)

## Business problem and users

Newsroom Elements helps media teams prepare and publish video stories in several languages. It is useful for journalists, editors, video producers, and publishing teams.

## Key workflows

- Search the story library.
- Check whether a story is ready to use.
- Select stories for a publishing package.
- Add notes and language information.
- Review, schedule, and publish a package.

## Lit and Web Components highlights

The product is made from small, reusable Web Components. Each part keeps its own design and can also work inside React, Vue, Angular, or a normal web page. Automated checks cover the most important actions.

## Architecture and state flow

The main workspace brings smaller page parts together. A shared controller keeps the current information and updates the screen after an action. The smaller parts receive information and send simple events back to the workspace.

## Accessibility and responsive behaviour

Buttons, forms, and links can be used with a keyboard. Labels explain what each field does, and important information is shown with words, not only colours. The layout also adjusts for tablets and phones.

## Run and verify

These commands install the project, check it, and start it on a computer:

```bash
npm ci
npm test
npm run build
npm run dev
```

## Structure

- `src/` — the product pages, actions, and design.
- `docs/demo.webm` — a short video showing the product.
- `package.json` — the commands and packages needed to run it.
- `README.md` — this simple product guide.

## Tradeoffs and roadmap

This project uses sample information and does not connect to a real company system. A future version could connect to a real media library, add editor roles, caption checks, and publishing channels.
