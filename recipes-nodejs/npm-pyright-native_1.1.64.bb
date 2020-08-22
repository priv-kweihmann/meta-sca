SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.64.tgz"
SRC_URI[md5sum] = "c4ad0a9663c3e71894434dfe71e82a2f"
SRC_URI[sha256sum] = "9c5d11280ebd939ce78f9b1c904c4c8dbdee1201f0b1d7c7fe859a57aad167ee"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
