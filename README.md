# Newsroom Elements

Newsroom Elements is a standards-native multilingual video-publishing suite. It demonstrates reusable Web Components for story discovery, rights status, editorial packaging and governed distribution.

[Watch the verified product demo](docs/demo.webm)

## Business problem and users

European media teams publish across languages, channels and host applications while protecting rights and editorial standards. Producers, rights editors, localisation teams and publishers use one composable workflow.

## Key workflows

- Search and filter a rights-aware story library.
- Select reusable editorial assets.
- Build a release package with language and editorial context.
- Send packages to review.
- Advance releases through review, scheduling and publication.

## Lit and Web Components highlights

Lit reactive properties/state, encapsulated Shadow DOM, keyed rendering, a reusable reactive controller, composed custom events, typed custom-element APIs and jsdom component tests. Components can be hosted by React, Vue, Angular or server-rendered pages.

## Architecture and state flow

The workspace coordinates navigation and selection. `EditorialController` encapsulates the release lifecycle and requests host updates. Leaf story/status elements accept typed properties and emit framework-neutral events.

## Accessibility and responsive behaviour

Native controls preserve keyboard behaviour across shadow roots, actions have descriptive names, statuses remain text-readable and the component grid adapts to narrow hosts.

## Run and verify

```bash
npm ci
npm test
npm run build
npm run dev
```

## Structure

- `src/my-element.ts` — publishing workspace
- `src/editorial-controller.ts` — release lifecycle controller
- `src/story-card.ts` — interoperable story component
- `src/status-card.ts` — reusable metric element
- `src/status-card.test.ts` — Shadow DOM/event tests

## Tradeoffs and roadmap

Media and rights state are illustrative. Production evolution includes MAM integration, caption QA, rights territories, editorial approvals, provenance signatures, distribution APIs, analytics and host-framework examples.
