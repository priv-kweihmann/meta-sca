SUMMARY = "NPM: readdir-scoped-modules"
DESCRIPTION = "Like `fs.readdir` but handling `@org/module` dirs as if they were a single entry."
HOMEPAGE = "https://github.com/npm/readdir-scoped-modules"

DEPENDS = "npm-debuglog-native npm-dezalgo-native npm-graceful-fs-native npm-once-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/readdir-scoped-modules/-/readdir-scoped-modules-1.1.0.tgz"
SRC_URI[md5sum] = "e7eb1a399a2101f23f693b824639bfcf"
SRC_URI[sha256sum] = "3a55179413862f8406892d4f0aa7d9461d48d224f68f77b4755acb5d6a538db7"

NPM_PKGNAME = "readdir-scoped-modules"

inherit npmhelper
inherit native
