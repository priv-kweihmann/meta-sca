SUMMARY = "Meta recipe for flake8 and plugins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "nativesdk-python3-flake8"

inherit sca-description
inherit python3-dir
inherit_defer nativesdk
PACKAGECONFIG ??= "\
                   2020 \
                   async \
                   comprehensions \
                   datetimez \
                   dlint \
                   encodings \
                   eradicate \
                   executable \
                   expression-complexity \
                   fixme \
                   functions \
                   mutable \
                   quotes \
                   requirements \
                   return \
                   secure-coding-standard \
                   strftime \
                   string-format \
                   use-fstring \
                   variables-names \
                   wemake-python \
                  "

PACKAGECONFIG[2020] = ",,nativesdk-python3-flake8-2020"
PACKAGECONFIG[async] = ",,nativesdk-python3-flake8-async"
PACKAGECONFIG[comprehensions] = ",,nativesdk-python3-flake8-comprehensions"
PACKAGECONFIG[datetimez] = ",,nativesdk-python3-flake8-datetimez"
PACKAGECONFIG[dlint] = ",,nativesdk-python3-flake8-dlint"
PACKAGECONFIG[encodings] = ",,nativesdk-python3-flake8-encodings"
PACKAGECONFIG[eradicate] = ",,nativesdk-python3-flake8-eradicate"
PACKAGECONFIG[executable] = ",,nativesdk-python3-flake8-executable"
PACKAGECONFIG[expression-complexity] = ",,nativesdk-python3-flake8-expression-complexity"
PACKAGECONFIG[fixme] = ",,nativesdk-python3-flake8-fixme"
PACKAGECONFIG[functions] = ",,nativesdk-python3-flake8-functions"
PACKAGECONFIG[mutable] = ",,nativesdk-python3-flake8-mutable"
PACKAGECONFIG[quotes] = ",,nativesdk-python3-flake8-quotes"
PACKAGECONFIG[return] = ",,nativesdk-python3-flake8-return"
PACKAGECONFIG[requirements] = ",,nativesdk-python3-flake8-requirements"
PACKAGECONFIG[secure-coding-standard] = ",,nativesdk-python3-flake8-secure-coding-standard"
PACKAGECONFIG[strftime] = ",,nativesdk-python3-flake8-strftime"
PACKAGECONFIG[string-format] = ",,nativesdk-python3-flake8-string-format"
PACKAGECONFIG[use-fstring] = ",,nativesdk-python3-flake8-use-fstring"
PACKAGECONFIG[variables-names] = ",,nativesdk-python3-flake8-variables-names"
PACKAGECONFIG[wemake-python] = ",,nativesdk-python3-wemake-python-styleguide"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
SCA_TOOL_DESCRIPTION = "flake8"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-flake8"
