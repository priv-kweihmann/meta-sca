SUMMARY = "NPM: unherit"
DESCRIPTION = "Clone a constructor without affecting the super-class"
HOMEPAGE = "https://github.com/wooorm/unherit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/unherit/-/unherit-3.0.0.tgz"
SRC_URI[md5sum] = "1b229d32421fb662f0425f9c15284016"
SRC_URI[sha256sum] = "b364aa8a72bc3187279578e32c4a7295d19d25437e03d8db15e7fa9e2adea6fb"

NPM_PKGNAME = "unherit"

inherit npmhelper
inherit native
