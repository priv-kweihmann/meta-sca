SUMMARY = "NPM: @cspell/dict-csharp"
DESCRIPTION = "C# dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/csharp#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-csharp/-/dict-csharp-2.0.1.tgz"
SRC_URI[md5sum] = "6c1600ca748f4ae280adf0a88bf25ca1"
SRC_URI[sha256sum] = "548e56485728580425ff2af94e4ecb2f8b32e69d8adc73b2ad7ed8f18f12b10b"

NPM_PKGNAME = "@cspell/dict-csharp"

inherit npmhelper
inherit native
