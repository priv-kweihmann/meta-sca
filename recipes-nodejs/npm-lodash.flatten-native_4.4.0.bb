SUMMARY = "NPM: lodash.flatten"
DESCRIPTION = "The lodash method `_.flatten` exported as a module."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.flatten/-/lodash.flatten-4.4.0.tgz"
SRC_URI[md5sum] = "47bdffdc45737e867a1f9dbe4f3f3d55"
SRC_URI[sha256sum] = "9c3babcd8b5248a959f1c7f9444f93bd8d509d0f1df13334ae5053185c1521fc"

NPM_PKGNAME = "lodash.flatten"

inherit npmhelper
inherit native
