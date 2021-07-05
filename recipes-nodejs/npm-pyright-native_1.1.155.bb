SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.155.tgz"
SRC_URI[md5sum] = "32290fec9a351d0e0d01e6e6fe50edb2"
SRC_URI[sha256sum] = "f6de5584a95fbe1ee6262ce19466717b386725b742bfa0a8afc22393d3607ad9"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
