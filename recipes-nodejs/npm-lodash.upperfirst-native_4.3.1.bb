SUMMARY = "NPM: lodash.upperfirst"
DESCRIPTION = "The lodash method `_.upperFirst` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.upperfirst/-/lodash.upperfirst-4.3.1.tgz"
SRC_URI[md5sum] = "b22c8565b1f737b7e1070d3806492c38"
SRC_URI[sha256sum] = "83599de204e53f25e1fa36649ab2033d40f165c9a426d74639edcb259f584d5a"

NPM_PKGNAME = "lodash.upperfirst"

inherit npmhelper
inherit native
