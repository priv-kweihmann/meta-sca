SUMMARY = "NPM: ignore"
DESCRIPTION = "Ignore is a manager and filter for .gitignore rules, the one used by eslint, gitbook and many others."
HOMEPAGE = "https://github.com/kaelzhang/node-ignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=df4fe86855c0c73f4a52d5e556826c48"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ignore/-/ignore-5.1.6.tgz"
SRC_URI[md5sum] = "5be7cbccb042cb2c78ffe54585b75ed6"
SRC_URI[sha256sum] = "9a28514a4dad0e7042d4fe3715800950cff4b5eb0673a927a7c2b7ee359c1972"

NPM_PKGNAME = "ignore"

inherit npmhelper
inherit native
