SUMMARY = "NPM: mimic-fn"
DESCRIPTION = "Make a function mimic another one"
HOMEPAGE = "https://github.com/sindresorhus/mimic-fn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mimic-fn/-/mimic-fn-3.1.0.tgz"
SRC_URI[md5sum] = "515dc09e046aeb2c5a4a05a976e19bf1"
SRC_URI[sha256sum] = "6324222cd0586846c2477c033ea14930a3b21e0e97486c43012de95ab0069da0"

NPM_PKGNAME = "mimic-fn"

inherit npmhelper
inherit native
