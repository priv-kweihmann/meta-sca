SUMMARY = "NPM: ret"
DESCRIPTION = "Tokenizes a string that represents a regular expression."
HOMEPAGE = "https://github.com/fent/ret.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62b4d27c9158c9d9913bca3764f410e0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ret/-/ret-0.3.1.tgz"
SRC_URI[md5sum] = "652bcc6500b957b70745ba50a19f91f5"
SRC_URI[sha256sum] = "037e953f8989292919a1703a0df684136283de826e007615c5f2581a5f871b5d"

NPM_PKGNAME = "ret"

inherit npmhelper
inherit native
