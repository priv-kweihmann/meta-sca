SUMMARY = "NPM: is-string"
DESCRIPTION = "Is this value a JS String object or primitive? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-string/-/is-string-1.0.6.tgz"
SRC_URI[md5sum] = "4011805b57b0620fe11e548b4fd8a16d"
SRC_URI[sha256sum] = "30866f3f23009e3598653a9ee564605c8eeefe8b086259ce8a934e3872396211"

NPM_PKGNAME = "is-string"

inherit npmhelper
inherit native
