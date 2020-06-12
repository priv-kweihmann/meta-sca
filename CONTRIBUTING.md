# Contribution guideline

First of all thank you for considering a contribution to this project.
Here are a few points we'd like you to address

## How-To contribute

Contributions shall be made via pull-requests.
These pull requests shall do the following

- target branch shall always be `master`
  - backports to other release versions should always have a `[<layer>]` prefix for each commit message
    e.g. `[zeus] add missing dependency to component`
- if commits refer to an issue please add `Closes #<issue>` or `Relates to #<issue>` into the commit message
  e.g.

  ```text
  add missing dependency to component

  Closes #1234
  ```

- please describe your change

### Contributing via other channels

If it is for you not possible to open a pull request and can also
send patches in `git patch format` to the layer maintainer.

**NOTE**: pull requests are always the preferred method

### What happens when your contribution will be accepted

If the contribution was for all release branches, the layer maintainer will cherry-pick your change to the other release branches.

### Adding a new feature

If you want to add a new feature/module please add a `description` of the tool matching the this [json-schema file](files/description-schema.json).

Also please open an issue in the issue tracker using the **Feature request** template

## Licensing

### New code files

Each code contribution is licensed under `BSD-2-Clause` - please add a `SPDX` header to that file, e.g.

```bitbake
# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) <year>, <your name>
```

this is done to avoid future issue in licensing.
Your copyright is not affected by that.

### New recipe files

New recipes are licensed under either `MIT` and/or `BSD-2-Clause`

### Files from 3rd party

If permitted files from 3rd can be added, if

- the terms and licenses are added as comment at the beginning of the file
- the original license it added in `SPDX` notation
- the original license allows the usage in combination with `MIT` and `BSD-2-Clause`
  - currently that should be `BSD-0-Clause`, `BSD-2-Clause`, `BSD-3-Clause`, `MIT` and `Apache-2.0`

if you feel unsure about licensing, please reach out before opening a pull request

### Other licenses

Other, especially **non permissive licenses** such `GPL-*` can unfortunately not be considered in this layer.
But please reach out, maybe there is a way to make it work.
