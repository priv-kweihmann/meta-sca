SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.48.tgz"
SRC_URI[md5sum] = "55c41f1cd07a9cee3b15b2e4bbd5757c"
SRC_URI[sha256sum] = "76aa52f1430161aa84496585d2f8f655def0aa8fe881c3e16e9f25acdc75b604"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
