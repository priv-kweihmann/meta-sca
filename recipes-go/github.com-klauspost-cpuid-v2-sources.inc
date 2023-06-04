SRC_URI += "https://proxy.golang.org/github.com/klauspost/cpuid/v2/@v/v2.2.5.zip;srcoutput=github.com/klauspost/cpuid/v2;srcinput=github.com/klauspost/cpuid/v2@v2.2.5;downloadfilename=github-com-klauspost-cpuid-v2-2.2.5.zip;name=github-com-klauspost-cpuid-v2"
SRC_URI[github-com-klauspost-cpuid-v2.sha256sum] = "47d1be8934e0df4b670694305fba671729f79670487f80b8dce00622db66d85d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/klauspost/cpuid/v2/LICENSE;md5=00d6f962401947482d082858f7ba2ff3 \
"

GOSRC_INCLUDEGUARD += "github.com-klauspost-cpuid-v2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
