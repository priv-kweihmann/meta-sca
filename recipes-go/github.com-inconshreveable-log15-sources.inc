SRC_URI += "https://proxy.golang.org/github.com/inconshreveable/log15/@v/v0.0.0-20201112154412-8562bdadbbac.zip;srcoutput=github.com/inconshreveable/log15;srcinput=github.com/inconshreveable/log15@v0.0.0-20201112154412-8562bdadbbac;downloadfilename=github-com-inconshreveable-log15-0.0.0-20201112154412-8562bdadbbac.zip;name=github-com-inconshreveable-log15"
SRC_URI[github-com-inconshreveable-log15.sha256sum] = "7bcdfcf1b3d69569e6c77942a0bacb8b60a152cf010ba27cae994350b6577ae0"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/inconshreveable/log15/LICENSE;md5=b23cff9db13f093a4e6ff77105cbd8eb \
    file://src/github.com/inconshreveable/log15/term/LICENSE;md5=8dadfef729c08ec4e631c4f6fc5d43a0 \
"

GOSRC_INCLUDEGUARD += "github.com-inconshreveable-log15-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-stack-stack-sources.inc', '', 'github.com-go-stack-stack-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-colorable-sources.inc', '', 'github.com-mattn-go-colorable-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
