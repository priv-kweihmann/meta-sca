SRC_URI += "https://proxy.golang.org/github.com/xanzy/ssh-agent/@v/v0.3.2.zip;srcoutput=github.com/xanzy/ssh-agent;srcinput=github.com/xanzy/ssh-agent@v0.3.2;downloadfilename=github-com-xanzy-ssh-agent-0.3.2.zip;name=github-com-xanzy-ssh-agent"
SRC_URI[github-com-xanzy-ssh-agent.sha256sum] = "852b4f2a541a14174817eabc337910be1f093152dfd9020c716a39e7176a2548"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xanzy/ssh-agent/LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc \
"

GOSRC_INCLUDEGUARD += "github.com-xanzy-ssh-agent-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-microsoft-go-winio-sources.inc', '', 'github.com-microsoft-go-winio-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
