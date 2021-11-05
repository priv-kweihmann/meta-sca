SUMMARY = "NPM: ignore"
DESCRIPTION = "Ignore is a manager and filter for .gitignore rules, the one used by eslint, gitbook and many others."
HOMEPAGE = "https://github.com/kaelzhang/node-ignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=df4fe86855c0c73f4a52d5e556826c48"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ignore/-/ignore-5.1.9.tgz"
SRC_URI[md5sum] = "bc0cf0f3cb21e4722e699698d7934852"
SRC_URI[sha256sum] = "b3ca2ddf693d745de3300628d8d22f263189e0d574cd1780542b04dc4f747fe3"

NPM_PKGNAME = "ignore"

inherit npmhelper
inherit native
