SUMMARY = "NPM: import-meta-resolve"
DESCRIPTION = "Resolve things like Node.js — ponyfill for `import.meta.resolve`"
HOMEPAGE = "https://github.com/wooorm/import-meta-resolve#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

DEPENDS = "npm-builtins-native"

SRC_URI = "https://registry.npmjs.org/import-meta-resolve/-/import-meta-resolve-1.0.1.tgz"
SRC_URI[md5sum] = "0568e04e82deb9987d37f1a0a3309632"
SRC_URI[sha256sum] = "c7f53358a37e945bb8552e015d4feb80ca701fc8b1c2fd85d88825b0af620ba3"

NPM_PKGNAME = "import-meta-resolve"

inherit npmhelper
inherit native
