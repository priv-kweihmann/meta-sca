SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.44.tgz"
SRC_URI[md5sum] = "99c39ce2a211e04dc02c86768f1fe888"
SRC_URI[sha256sum] = "00244230e2f1ddfcbc0156f99ae300f11e4e8a4651dd35cb98e429907a307e27"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
