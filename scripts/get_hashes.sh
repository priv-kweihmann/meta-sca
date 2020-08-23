#!/bin/sh
res=""
mode=$1
case ${mode} in
    issue)
        shift
        for number in $@; do
            x=$(git log --oneline --grep "Fixes #${number}" --grep "Closes #${number}" --grep "Relates to #${number}" --pretty=format:"%h" --reverse)
            res="${res}\n${x}"
        done
        ;;
    hash)
        shift
        res=$@
        ;;
    unpushed)
        shift
        res=$(git log origin/staging..staging --oneline | cut -d' ' -f1 | tac | tr '\n' ' ')
        ;;
esac
_BRANCHES="master dunfell zeus warrior"
if [ ! -z "${BRANCHES}" ]; then
    _BRANCHES=${BRANCHES}
fi
for b in ${_BRANCHES}; do
    git checkout ${b} 1> /dev/null
    git pull 1> /dev/null
    git cherry-pick $(echo ${res} | tr '\n' ' ')
done

git checkout staging