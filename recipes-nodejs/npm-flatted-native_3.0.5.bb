SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.0.5.tgz"
SRC_URI[md5sum] = "6c890405e9498d387103dc9fc5f5df92"
SRC_URI[sha256sum] = "cd6d1e110598adcd8da91b4da1917565628052055b938c48aa3c492765fc5318"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
