SUMMARY = "NPM: cspell-dict-powershell"
DESCRIPTION = "PowerShell Keyword Dictionary"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/powershell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-powershell/-/cspell-dict-powershell-1.1.4.tgz"
SRC_URI[md5sum] = "871c33525f4266996c66ea3e2601647f"
SRC_URI[sha256sum] = "03426206cbd7ea26f2786ebde62d377a82286214ef44fd20bb7614901cab4040"

NPM_PKGNAME = "cspell-dict-powershell"

inherit npmhelper
inherit native
