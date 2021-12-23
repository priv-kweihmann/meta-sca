SUMMARY = "NPM: esutils"
DESCRIPTION = "utility box for ECMAScript language tools"
HOMEPAGE = "https://github.com/estools/esutils"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=e74cede38e957fe3e525b0e53a510bcf"

SRC_URI = "https://registry.npmjs.org/esutils/-/esutils-2.0.3.tgz"
SRC_URI[md5sum] = "fbea0e3ececd72f8135013e599bb44b3"
SRC_URI[sha256sum] = "c5adbd730a495a3c635bbae9ee5f693b95c7e13b395f7036efab8232c5f0640f"

NPM_PKGNAME = "esutils"

inherit npmhelper
inherit native
