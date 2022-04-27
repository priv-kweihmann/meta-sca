# go-gen

A tool to generate go-recipes and their dependencies.

## Prerequisites

- python 3.7+
- python3-pip
- scancode-toolkit (`pip3 install scancode-toolkit`)
- oelint-parser (`pip3 install oelint-parser`)
- tqdm (`pip3 install tqdm`)
- requests (`pip3 install requests`)

## Usage

```shell
usage: go-gen [-h] [--version VERSION] [--tmpdir TMPDIR] [--errata ERRATA] [--usetests] [--withunused] [--nolicensesfrom [NOLICENSESFROM [NOLICENSESFROM ...]]] [--force]
              [--recursionlevel RECURSIONLEVEL]
              path mod [mod ...]

go-recipe generator

positional arguments:
  path                  path to store the recipes to
  mod                   go-mod to create

optional arguments:
  -h, --help            show this help message and exit
  --version VERSION     explicit version to chose (default: )
  --tmpdir TMPDIR       explicit temporary directory to chose (default: /tmp)
  --errata ERRATA       errata file for this tool (default: ./go-gen-errata.json)
  --usetests            Use also test files (default: False)
  --withunused          Add go.mod even they are unused (default: False)
  --nolicensesfrom [NOLICENSESFROM [NOLICENSESFROM ...]]
                        Ignore licenses from these pattern (default: ['vendor/*', 'examples/*', '*/testdata/*', 'tutorial/*'])
  --force               Force creation (default: False)
  --recursionlevel RECURSIONLEVEL
                        Level of recursion (default: 99999999999)
```

for the go import `cloud.google.com/go/bigquery` you simply have to run `go-gen /path/to/where/the/recipes/are/stored cloud.google.com/go/bigquery`.
You could also generate multiple imports in one run.

## errata file

Sometimes not all the necessary information can be extracted automatically. Therefore an errata file exists, which is a json dictionary.
Each key in this file is named as the import.

The following sub-keys can be configured (all options are opt-in)

 | key            | type          | description                                                                                                                                                          |
 | -------------- | ------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
 | addtionalstrip | string        | additional path elements that will be stripped on unpacking                                                                                                          |
 | buildsuffix    | string        | overrides the name of the import
 | extra          | array[string] | additional bitbake lines to be put into the shared inc files                                                                                                         |
 | extramods      | array[string] | extra dependencies of this import                                                                                                                                    |
 | inputname      | string        | overrides the sources dir                                                                                                                                   |
 | licenseignore  | array[string] | paths that should be ignored for license extraction                                                                                                                  |
 | licenses       | array[dict]   | Overrides the license detection                                                                                                                                      |
 | licenses.file  | string        | path to license file                                                                                                                                                 |
 | licenses.spdx  | string        | spdx id of the license                                                                                                                                               |
 | modscan        | string        | where to scan for go.mod                                                                                                                                             |
 | recipeextra    | array[string] | additional bitbake lines to be put into the recipe                                                                                                                   |
 | striplevel     | int           | How many of the leading path components have to be stripped on unpacking                                                                                             |
 | url            | string        | URL were to pull the sources from. Needs to start with git://, http:// or https://. You can add `%VERSION%` as a wildcard for the set version anywhere in the string |
 | version        | string        | explicitly defines a version, otherwise always the latest will be picked                                                                                             |
 