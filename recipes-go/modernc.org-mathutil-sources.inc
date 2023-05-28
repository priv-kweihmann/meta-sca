SRC_URI += "https://proxy.golang.org/modernc.org/mathutil/@v/v1.5.0.zip;srcoutput=modernc.org/mathutil;srcinput=modernc.org/mathutil@v1.5.0;downloadfilename=modernc-org-mathutil-1.5.0.zip;name=modernc-org-mathutil"
SRC_URI[modernc-org-mathutil.sha256sum] = "c17a767eaa5eb62d9bb105b8ece7f249186dd52b9b533301bec140b3d5fd260f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/modernc.org/mathutil/LICENSE;md5=2604a98416f52ae5aaceb3630431020c \
    file://src/modernc.org/mathutil/mersenne/LICENSE;md5=81379c6ad62fac3a97677709b11e0962 \
"

GOSRC_INCLUDEGUARD += "modernc.org-mathutil-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-remyoudompheng-bigfft-sources.inc', '', 'github.com-remyoudompheng-bigfft-sources.inc', d)}
