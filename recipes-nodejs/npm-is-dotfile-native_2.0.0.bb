SUMMARY = "NPM: is-dotfile"
DESCRIPTION = "Return true if a file path is (or has) a dotfile. Returns false if the path is a dot directory."
HOMEPAGE = "https://github.com/jonschlinkert/is-dotfile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6db0829782d67e30695686ebb45970a"

DEPENDS = "npm-dotfile-regex-native"

SRC_URI = "https://registry.npmjs.org/is-dotfile/-/is-dotfile-2.0.0.tgz"
SRC_URI[md5sum] = "aa082a232b53f5524e84c18819bf22cf"
SRC_URI[sha256sum] = "1f12e670cfb291a76ed0e79762a42dd6b4e49c71d65ea7d2e6f8091a195bbc3a"

NPM_PKGNAME = "is-dotfile"

inherit npmhelper
inherit native
