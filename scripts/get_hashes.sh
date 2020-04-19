#!/bin/sh
res=""
for number in $@; do
    x=$(git log --oneline --grep "Closes #${number}" --grep "Relates to #${number}" --pretty=format:"%h" --reverse)
    res="${res}\n${x}"
done
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