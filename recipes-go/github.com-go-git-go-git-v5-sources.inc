SRC_URI += "https://proxy.golang.org/github.com/go-git/go-git/v5/@v/v5.3.0.zip;srcoutput=github.com/go-git/go-git/v5;srcinput=github.com/go-git/go-git/v5@v5.3.0;downloadfilename=github-com-go-git-go-git-v5-5.3.0.zip;name=github-com-go-git-go-git-v5"
SRC_URI[github-com-go-git-go-git-v5.sha256sum] = "8918a24348a0a16db983688ef0b829883fad4f68051145424cca71d91309459e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-git/go-git/v5/LICENSE;md5=cd19105b8dee6a326c424d3112aaedd6 \
"

GOSRC_INCLUDEGUARD += "github.com-go-git-go-git-v5-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-emirpasic-gods-sources.inc', '', 'github.com-emirpasic-gods-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-git-gcfg-sources.inc', '', 'github.com-go-git-gcfg-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-git-go-billy-v5-sources.inc', '', 'github.com-go-git-go-billy-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-git-go-git-fixtures-v4-sources.inc', '', 'github.com-go-git-go-git-fixtures-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-imdario-mergo-sources.inc', '', 'github.com-imdario-mergo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jbenet-go-context-sources.inc', '', 'github.com-jbenet-go-context-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jessevdk-go-flags-sources.inc', '', 'github.com-jessevdk-go-flags-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kevinburke-ssh-config-sources.inc', '', 'github.com-kevinburke-ssh-config-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-go-homedir-sources.inc', '', 'github.com-mitchellh-go-homedir-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sergi-go-diff-sources.inc', '', 'github.com-sergi-go-diff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-xanzy-ssh-agent-sources.inc', '', 'github.com-xanzy-ssh-agent-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-check.v1-sources.inc', '', 'gopkg.in-check.v1-sources.inc', d)}
