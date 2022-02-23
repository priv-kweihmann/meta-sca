SUMMARY = "NPM: @cspell/dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/powershell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-powershell/-/dict-powershell-2.0.0.tgz"
SRC_URI[md5sum] = "f21e4f2927e79b9be5e93341e390644e"
SRC_URI[sha256sum] = "65f27998a3c082447bbb8c50a7bc3c29e74c1d2f8493697664cef97bcc69e77a"

NPM_PKGNAME = "@cspell/dict-powershell"

inherit npmhelper
inherit native
