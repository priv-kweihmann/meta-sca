SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.62.tgz"
SRC_URI[md5sum] = "5fa0ab48b681b65676881ab999a8b37d"
SRC_URI[sha256sum] = "d0f18ba364d5e2ab6ff93b8367feba4481a946cf3edcbd6c114ffc6de7201ecd"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
