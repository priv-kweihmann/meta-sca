SUMMARY = "NPM: aria-query"
DESCRIPTION = "Programmatic access to the ARIA specification"
HOMEPAGE = "https://github.com/A11yance/aria-query#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cadce3caaeb4d7ea5e8c0e57d5f3d1e7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/aria-query/-/aria-query-5.0.0.tgz"
SRC_URI[md5sum] = "b37a5b3b02eca6f99e4b9e23bd22b54b"
SRC_URI[sha256sum] = "bee97a938deb100a949ab7087e4437b236ba0b39ccb98668f4f0056b823db59f"

NPM_PKGNAME = "aria-query"

inherit npmhelper
inherit native
