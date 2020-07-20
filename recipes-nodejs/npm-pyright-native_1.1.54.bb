SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.54.tgz"
SRC_URI[md5sum] = "02e927261a282f48ad1f25858343e592"
SRC_URI[sha256sum] = "af142c7561ca0d50be53575006fd2884e8bdfc7233d35b064228cff2eef81bfa"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
