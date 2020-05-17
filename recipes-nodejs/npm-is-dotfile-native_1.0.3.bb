SUMMARY = "NPM: is-dotfile"
DESCRIPTION = "Return true if a file path is (or has) a dotfile. Returns false if the path is a dot directory."
HOMEPAGE = "https://github.com/jonschlinkert/is-dotfile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6db0829782d67e30695686ebb45970a"

SRC_URI = "https://registry.npmjs.org/is-dotfile/-/is-dotfile-1.0.3.tgz"
SRC_URI[md5sum] = "9c1b18df01884a55636db529eca19fe2"
SRC_URI[sha256sum] = "91c66568d2de605796160ab63b4e856f426ce7a9ef650a34de39ae572dec678e"

S = "${WORKDIR}/package"

NPM_PKGNAME = "is-dotfile"

inherit npmhelper
inherit native
