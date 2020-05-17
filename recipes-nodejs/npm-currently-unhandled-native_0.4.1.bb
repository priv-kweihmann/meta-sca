SUMMARY = "NPM: currently-unhandled"
DESCRIPTION = "Track the list of currently unhandled promise rejections."
HOMEPAGE = "https://github.com/jamestalmage/currently-unhandled#readme"

DEPENDS = "npm-array-find-index-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=289129afe2c8d393c7a535bcdcbddb86"

SRC_URI = "https://registry.npmjs.org/currently-unhandled/-/currently-unhandled-0.4.1.tgz"
SRC_URI[md5sum] = "4d7fef46fe3f9cd383d06ced6a46499c"
SRC_URI[sha256sum] = "1c20bcdf73b38daafb49966907bd7f738b6391e606e072d8dfbf296eea16d61d"

NPM_PKGNAME = "currently-unhandled"

inherit npmhelper
inherit native
