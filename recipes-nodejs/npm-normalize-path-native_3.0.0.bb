SUMMARY = "NPM: normalize-path"
DESCRIPTION = "Normalize slashes in a file path to be posix/unix-like forward slashes. Also condenses repeat slashes to a single slash and removes and trailing slashes, unless disabled."
HOMEPAGE = "https://github.com/jonschlinkert/normalize-path"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ccdc0959f67943eb090f7e7c299621af"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-path/-/normalize-path-3.0.0.tgz"
SRC_URI[md5sum] = "2821b760c1df5dcc38328f154a6ea3cb"
SRC_URI[sha256sum] = "0b983cca55c555cdc0e919ed5ecd0e4648f6e303f9dffeb449f1ad760d4f84fe"

NPM_PKGNAME = "normalize-path"

inherit npmhelper
inherit native
