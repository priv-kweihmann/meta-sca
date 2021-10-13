SUMMARY = "NPM: core-js"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js/-/core-js-3.18.3.tgz"
SRC_URI[md5sum] = "855a9177478747baef0dae638fa3bd82"
SRC_URI[sha256sum] = "44abffeebbd5e3fa1df5ff4c3ad93ce49f5ebe60958d112755165305d123ffe6"

NPM_PKGNAME = "core-js"

inherit npmhelper
inherit native
