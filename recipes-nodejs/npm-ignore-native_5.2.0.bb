SUMMARY = "NPM: ignore"
DESCRIPTION = "Ignore is a manager and filter for .gitignore rules, the one used by eslint, gitbook and many others."
HOMEPAGE = "https://github.com/kaelzhang/node-ignore#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=df4fe86855c0c73f4a52d5e556826c48"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ignore/-/ignore-5.2.0.tgz"
SRC_URI[md5sum] = "2e729dee0a49168369b20bf861971ee7"
SRC_URI[sha256sum] = "d64da771a59741383179615065aedf9e098ac6b4b9e13787e95e419f745151cd"

NPM_PKGNAME = "ignore"

inherit npmhelper
inherit native
