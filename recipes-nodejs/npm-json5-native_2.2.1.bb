SUMMARY = "NPM: json5"
DESCRIPTION = "JSON for humans."
HOMEPAGE = "http://json5.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=d80f2808a405d641840b50a06f80e93c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json5/-/json5-2.2.1.tgz"
SRC_URI[md5sum] = "e7d2fc3e0299d8005b5f7f46161cc227"
SRC_URI[sha256sum] = "1d044eb7a06ddb2429366e0630dd884d1e57f116e3704b293631fa4dde045a59"

NPM_PKGNAME = "json5"

inherit npmhelper
inherit native
