SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.218.tgz"
SRC_URI[md5sum] = "4e0b62f6bd82be9a930d596eddb6445b"
SRC_URI[sha256sum] = "99b3fa2db63859c16da776843d174506433b73c3a6335d7dbfd2076a48344eb8"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
