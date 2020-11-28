SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.0.13.tgz"
SRC_URI[md5sum] = "87f815e635fdf17c8835c81a81e25fb9"
SRC_URI[sha256sum] = "9d893e59b9787cbb2d73b4d2592006b761853238c04c7a7efe946fbd3a64d40d"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
