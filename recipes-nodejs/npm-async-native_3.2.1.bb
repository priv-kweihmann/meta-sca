SUMMARY = "NPM: async"
DESCRIPTION = "Higher-order functions and common patterns for asynchronous code"
HOMEPAGE = "https://caolan.github.io/async/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f63c1fa4541b2f2f34d77140ebe89d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/async/-/async-3.2.1.tgz"
SRC_URI[md5sum] = "e33ec08f5d9d0c1f66a0d00233ce87d2"
SRC_URI[sha256sum] = "e21a0a80e971bc95d0636aa83d86b2677c47952814ada73d3f11f62736835d43"

NPM_PKGNAME = "async"

inherit npmhelper
inherit native
