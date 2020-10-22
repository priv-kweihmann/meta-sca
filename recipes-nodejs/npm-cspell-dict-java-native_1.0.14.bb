SUMMARY = "NPM: cspell-dict-java"
DESCRIPTION = "Java dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/java#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-java/-/cspell-dict-java-1.0.14.tgz"
SRC_URI[md5sum] = "8c0df931def140e2f133f4a5978c921f"
SRC_URI[sha256sum] = "bdc3a46ec7493f29ff21575bf6f9149c68de35d74685e8dd6a563985e17e3e1f"

NPM_PKGNAME = "cspell-dict-java"

inherit npmhelper
inherit native
