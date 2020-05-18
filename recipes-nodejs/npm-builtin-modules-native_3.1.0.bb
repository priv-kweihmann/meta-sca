SUMMARY = "NPM: builtin-modules"
DESCRIPTION = "List of the Node.js builtin modules"
HOMEPAGE = "https://github.com/sindresorhus/builtin-modules#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/builtin-modules/-/builtin-modules-3.1.0.tgz"
SRC_URI[md5sum] = "0ec68a87f4673912293084f6d7ef2644"
SRC_URI[sha256sum] = "bda9d335d79fecc9fcd481cc6ad08df7011a539fefba1d7dd3b936a3e2115488"

NPM_PKGNAME = "builtin-modules"

inherit npmhelper
inherit native
