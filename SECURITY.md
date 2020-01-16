# Security Policy

## Staging branch

The `staging` branch is always first point where changes will be introduced, like package updates, features a.s.o.
Package updates from that branch are synced into all [supported branches](#supported-branches) ~2 weeks, to minimize the 
size of the changeset, as package updates can occur very frequently.
**Don't** create branches from `staging` as it could be rebased or rewritten at any time.

## Supported branches

Following branches are actively maintained.

| Branch  | Integration with poky | Integration with meta-oe | Integration with meta-clang | Support ends |    Release tag    |
| ------- | --------------------- | ------------------------ | --------------------------- | ------------ | ----------------- |
| master  | daily                 | daily                    | daily                       | never        | v[VERSION]        |
| zeus    | daily                 | daily                    | daily                       | Q2 2021      | vzeus[VERSION]    |
| warrior | daily                 | daily                    | daily                       | Q4 2020      | vwarrior[VERSION] |
| thud    | daily                 | daily                    | daily                       | Q2 2020      | vthud[VERSION]    |

## Other branches

Following branches get package updates from time to time, but no feature updates nor releases according to the current release plan

| Branch  | Integration with poky | Integration with meta-oe | Integration with meta-clang | Support ends  |    Release tag    |
| ------- | --------------------- | ------------------------ | --------------------------- | ------------- | ----------------- |
| sumo    | on push               | n.a.                     | n.a.                        | already ended | vsumo[VERSION]    |
| rocko   | on push               | n.a.                     | n.a.                        | already ended | vrocko[VERSION]   |
| pyro    | on push               | n.a.                     | n.a.                        | already ended | vpyro[VERSION]    |
| krogoth | on push               | n.a.                     | n.a.                        | already ended | vkrogoth[VERSION] |

## Reporting a Vulnerability

Vulnerabilities or other security issues can be reported as a issue, please use the bug-template.
Non-disclosure issues can be reported via mail
