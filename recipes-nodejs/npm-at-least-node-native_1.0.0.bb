SUMMARY = "NPM: at-least-node"
DESCRIPTION = "Lightweight Node.js version sniffing/comparison"
HOMEPAGE = "https://github.com/RyanZim/at-least-node#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd1cf73adc91a2a56db663c2a84b0bab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/at-least-node/-/at-least-node-1.0.0.tgz"
SRC_URI[md5sum] = "a44b13497c1e42fbfaaf2c0907f9be63"
SRC_URI[sha256sum] = "72ed27683dd2b68c48a7ee39e96a892f8621956b17c3b560da682b99405883fa"

NPM_PKGNAME = "at-least-node"

inherit npmhelper
inherit native
