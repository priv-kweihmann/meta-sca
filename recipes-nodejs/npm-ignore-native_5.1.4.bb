SUMMARY = "NPM: ignore"
DESCRIPTION = "Ignore is a manager and filter for .gitignore rules, the one used by eslint, gitbook and many others."
HOMEPAGE = "https://github.com/kaelzhang/node-ignore#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=df4fe86855c0c73f4a52d5e556826c48"

SRC_URI = "https://registry.npmjs.org/ignore/-/ignore-5.1.4.tgz"
SRC_URI[md5sum] = "5e63a02730c977293fd4a4bc3082d788"
SRC_URI[sha256sum] = "4e1aa590bf08a7bc707b1a80a9066d087bd203b17d609d0ee3345c6cd1f4c6dc"

NPM_PKGNAME = "ignore"

inherit npmhelper
inherit native
