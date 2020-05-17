SUMMARY = "NPM: regexpp"
DESCRIPTION = "Regular expression parser for ECMAScript."
HOMEPAGE = "https://github.com/mysticatea/regexpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

SRC_URI = "https://registry.npmjs.org/regexpp/-/regexpp-3.1.0.tgz"
SRC_URI[md5sum] = "d03ea17c193817fd0d316622bd38825a"
SRC_URI[sha256sum] = "c5da33ee1ba6800c6e7bd7e703b5c97a1ca33f1946c03fd73d30605d0e1e107c"

NPM_PKGNAME = "regexpp"

inherit npmhelper
inherit native
