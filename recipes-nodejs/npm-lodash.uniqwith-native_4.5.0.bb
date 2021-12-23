SUMMARY = "NPM: lodash.uniqwith"
DESCRIPTION = "The lodash method `_.uniqWith` exported as a module."
HOMEPAGE = "https://lodash.com/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

SRC_URI = "https://registry.npmjs.org/lodash.uniqwith/-/lodash.uniqwith-4.5.0.tgz"
SRC_URI[md5sum] = "19adb19b745cd7c514f604c80f550d94"
SRC_URI[sha256sum] = "bc9a77a3d6da570d4799401461d48b37f01be1b7896692db59548666315cb13e"

NPM_PKGNAME = "lodash.uniqwith"

inherit npmhelper
inherit native
