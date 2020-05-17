SUMMARY = "NPM: is-string"
DESCRIPTION = "Is this value a JS String object or primitive? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/is-string/-/is-string-1.0.5.tgz"
SRC_URI[md5sum] = "abe51bbe7cdfeff3c4253a143a9617c6"
SRC_URI[sha256sum] = "d6c05956276d3f3f9443ebe0cafd248191f0348bc397c6cfbcd52f4eb32efb1e"

NPM_PKGNAME = "is-string"

inherit npmhelper
inherit native
