SUMMARY = "NPM: cspell-dict-django"
DESCRIPTION = "Django dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/django#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9f0d19b8001b71df7bfa66b3e4df3454"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-django/-/cspell-dict-django-1.0.17.tgz"
SRC_URI[md5sum] = "4fc2b9226970cde23b0ae17fbe0fcda2"
SRC_URI[sha256sum] = "2793b78479c89862beedcf82ec78d8faa547f75e2a6c846be4143537c0fef495"

NPM_PKGNAME = "cspell-dict-django"

inherit npmhelper
inherit native
